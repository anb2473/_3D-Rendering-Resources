import Display.Display;
import Display.MeshObjects.RectangleMesh;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import static Display.Display.loadImage;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean skipNext = false;

        double x = -500;
        double y = 75;
        double u = 0;
        boolean isJump = false;
        //BufferedImage texture = loadImage("/BrickWall.jpg");
        Display display = new Display("test 3D scene", 1000, 800, "/Aurora.png", true, false);
        display.createFirstPersonCamera();
        display.addMeshToRoster(new RectangleMesh(150, (int) y, 175, 100, 100, 1050, 1, new Color(0, 0, 255)).mesh, "player");
        display.addMeshToRoster(new RectangleMesh((int) x, 75, 150, 100, 100, 100, 1, new Color(255, 0, 0)).mesh, "bar");
        while (true){
            long oTime = System.nanoTime();

            display.graphicsInit();
            display.replaceMesh(new RectangleMesh((int) x, 75, 150, 100, 100, 150, 1, new Color(255, 0, 1)).mesh, "bar");
            display.updateCameraByMesh();
            display.render();

            y -= u;
            if (isJump) {
                u -= 0.025;
                if (u < -3.5) {
                    u = 0;
                    isJump = false;
                }
            } else if (display.getKeys()[KeyEvent.VK_SPACE]) {
                u = 3.5;
                isJump = true;
            }

            x += 1.5;
            if (x > 1000) x = -500;

            long dTime = System.nanoTime() - oTime;
            if (dTime < 15000000)
                TimeUnit.NANOSECONDS.sleep(15000000 - dTime);
        }
    }
}