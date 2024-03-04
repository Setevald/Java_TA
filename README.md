# Steven - 2702398283 - L2AC

## Screenshots
### Animal class
![Animal Class](https://github.com/Setevald/Java_TA/assets/133423110/8f37ba9c-e3d1-4a90-9b8f-16e7db333fa8)

### Dog class
![Dog class](https://github.com/Setevald/Java_TA/assets/133423110/a4a78114-32af-4afd-ad46-9498eb18075d)

### Animal Driver
![Animal Driver](https://github.com/Setevald/Java_TA/assets/133423110/06472e77-8ae3-4b02-a8da-042352d8fc32)

### Results
![Result](https://github.com/Setevald/Java_TA/assets/133423110/5ef64f87-e376-4dd6-862d-01b1a4d17115)

## Explanation for the oop used
### 1. Encapsulation
The attributes inside `animal class` are declared as private, encapsulating the internal state of the class. They could be controlled by setter and gester, providing a level of abstraction and protection for the internal data.

### 2. Abstraction
`Animal class` is declared as abstract class which means by extended by subclasses. Example of makesound() which provide their own implementation for making a sound.

### 3. Inheritance 
In the `Dog class` it inherits the attributes and methods defined in 'Animal class' and also provide its own specific implementations. 

### 4. Polymorphism
The `speak()` method in the `AnimalClass` is overridden in the `Dog class`. When an object of type `Dog` is used, the overridden `speak()` method in the `Dog` class is invoked
