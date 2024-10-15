package Display.MeshObjects;

import java.awt.*;

public class RectangleMesh {
    public Mesh3D mesh;

    public RectangleMesh(int x, int y, int z, int width, int height, int depth, int res, Color color){
        mesh = new Mesh3D(new Triangle[] {
                new Triangle(x, y, z, x + width, y, z, x + width, y + height, z, color),
                new Triangle(x, y, z + depth, x + width, y + height, z + depth, x, y + height, z + depth, color),
                new Triangle(x, y + height, z + depth, x, y, z + depth, x, y + height, z, color),
                new Triangle(x, y, z, x, y, z + depth, x + width, y, z, color),
                new Triangle(x + width, y + height, z, x, y + height, z + depth, x + width, y + height, z + depth, color),
                new Triangle(x, y, z, x + width, y + height, z, x, y + height, z, color),
                new Triangle(x + width, y + height, z + depth, x + width, y, z + depth, x + width, y + height, z, color),
                new Triangle(x, y, z, x, y, z + depth, x, y + height, z, color),
                new Triangle(x + width, y, z, x, y, z + depth, x + width, y, z + depth, color),
                new Triangle(x, y + height, z, x, y + height, z + depth, x + width, y + height, z, color),
                new Triangle(x, y, z + depth, x + width, y, z + depth, x + width, y + height, z + depth, color),
                new Triangle(x + width, y, z, x + width, y, z + depth, x + width, y + height, z, color)
        });
    }
}
