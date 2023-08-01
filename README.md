# GeoTestTDD
This project demonstrates the use of Test-Driven Development (TDD) to write unit tests for a class that calculates the volume and surface area of three-dimensional shapes. The shapes that are tested are cuboids, square pyramids, and tetrahedrons.

## Exceution 
* The Geometry3D class is instantiated.
* The testCuboidVolumeWithPositiveInput() test is executed.
    * The input values for the cuboid are defined as 5, 3, and 10.
    * The cuboidVolume() method in the Geometry3D class is called with these input values.
    * The result of the calculation is checked to make sure that it is 150.
* The testCuboidVolumeWithNegativeInput() test is executed.
    * The input values for the cuboid are defined as -5, 3, and 10.
    * An exception is thrown because the length of the cuboid is negative.
* The testCuboidVolumeWithZeroInput() test is executed.
    * The input values for the cuboid are defined as 0, 3, and 10.
    * The result of the calculation is checked to make sure that it is 0.
* The testCuboidSurfaceAreaWithPositiveInput() test is executed.
    * The input values for the cuboid are defined as 5, 3, and 10.
    * The cuboidSurfaceArea() method in the Geometry3D class is called with these input values.
    * The result of the calculation is checked to make sure that it is 190.
* The testCuboidSurfaceAreaWithNegativeInput() test is executed.
    * The input values for the cuboid are defined as -5, 3, and 10.
    * An exception is thrown because the length of the cuboid is negative.
* The testCuboidSurfaceAreaWithZeroInput() test is executed.
    * The input values for the cuboid are defined as 0, 3, and 10.
    * The result of the calculation is checked to make sure that it is 0.

## Libraries Used
The project uses the JUnit testing framework.

## Technologies/Languages Used
The project is written in Java.

## Here are some of the features of the project:
The project uses TDD to ensure that the code is well-tested and reliable.
The project covers all of the possible scenarios for the volume and surface area calculations, including positive, negative, and zero inputs.
The project is designed to be easy to understand and follow, even for beginners.
The code in the project is well-commented and easy to read.

## Conclusion
This project is a good starting point for anyone who wants to learn about TDD or who wants to see how TDD can be used to test the volume and surface area of three-dimensional shapes.
To run the project, you can clone the repository to your local machine and then run the Geometry3DTest class. The unit tests will run and the results will be displayed in the console.

I hope you find this project helpful!



