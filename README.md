This project is a 3D rendering system for application in game creation.
As of now it can fully render 3D objects, and has basic camera functionalities. 
In the future I hope to also implement more functionalities such as more camera options, more mesh objects, texture systems, collision systems, full documentation, and more options.

This project is not recommended for serious projects as of now, but will eventually be patched up and made into a fully usable system.

How to use:
  Create a Display object with an instance.
  Call one of the add camera functions to add your desired camera type. (First person, rotatable, movable, etc.)
  Call GraphicsInit to begin.
  You can use inbuilt functions such as 'drawRect' or 'drawTriangle' to draw 2D objects.
  You can also call the 'addMeshToRoster' with a Mesh3D object to add a mesh into the 3D scene.
  Call camera update to render your 3D scene.
  Call render to finalize your graohics.
