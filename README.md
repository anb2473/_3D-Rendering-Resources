# 3D Rendering Engine for Java

This project is a 3D rendering system for application in game creation.
As of now it can fully render 3D objects, and has basic camera functionalities. 
In the future I hope to also implement more functionalities such as more camera options, more mesh objects, texture systems, collision systems, full documentation, and more options.

**NOTICE:** This project is not recommended for major projects as of now.

This system already has a `main.java` file, which will create a basic test scene.

### How to use
* Create a Display object with an instance.
* Call one of the add camera functions to add your desired camera type. (First person, rotatable, movable, etc.)
* Call GraphicsInit to begin.
* You can use inbuilt functions such as 'drawRect' or 'drawTriangle' to draw 2D objects.
* You can also call the 'addMeshToRoster' with a Mesh3D object to add a mesh into the 3D scene.
* Call camera update to render your 3D scene.
* Call render to finalize your graohics.
