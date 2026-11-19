# Java-Final-Exam
This repository contains a final exam on the Java programming language · В этом репозитории хранится итоговый экзамен по Java

In the program must be the following requirements:

1. Calculation Methods

Implement a separate method to calculate the volume of each geometric shape.

The methods must have exactly the following names and parameters:

cubeVolume(double side)
rectangularPrismVolume(double length, double width, double height)
cylinderVolume(double radius, double height)
volumeSphere(double radius)
volumeCone(double radius, double height)
All of these methods must:

Be static.
Receive the necessary measurements via parameters.
Return the result using the `return` statement.
Use the `double` data type for calculations.

2. Auxiliary Methods

Implement two additional methods:

displayResult(String name, double volume)
This method will display the name of the geometric figure and the calculated volume on the screen.
invalidMeasurements()
This method will display an error message when any of the entered measurements is negative.
Both methods must be static and must not return a value (void). 

3. Main Program

The main() method must perform the following operations:

Display the options menu.
Ask the user which geometric figure they want to calculate.
Request the corresponding measurements for each figure.
Call the appropriate calculation method.
Display the result using the showResult() method.
Verify that no measurement is negative.
Allow the user to perform multiple calculations without having to run the program again.
Terminate when the user selects option 0.

4. Required Control Structures

To develop the program, you must use the following:

Do-while loop: to repeat the menu until the user selects option 0.
Switch statement: to handle the different menu options.
if-else statements: to verify that the entered measurements are valid.
Static methods: to implement calculations and auxiliary operations.

5. Use of the Math Class

To perform mathematical calculations, you must use the following elements of the Math class:

Math.pow(): to calculate powers.
Math.PI: to use the number π.
You may not replace the calculation methods with operations written directly within the different switch cases. 

6. Validations

The program must handle the following situations:

If the user enters a negative measurement, the program must display the corresponding error message and not perform the calculation.
If the user enters 0 as the measurement, the program may perform the calculation and return a volume equal to 0.
If the user selects an option that does not exist, the program must display a message indicating that the option is invalid.
After performing a calculation or displaying an error, the program must return to the main menu.
If the user selects option 0, the program must display a closing message and terminate.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Программа должна соответствовать следующим требованиям:

1. Методы для расчётов

Реализуй отдельный метод для вычисления объёма каждой геометрической фигуры.

Методы должны называться и принимать параметры ровно так:

cubeVolume(double side)
rectangularPrismVolume(double length, double width, double height)
cylinderVolume(double radius, double height)
volumeSphere(double radius)
volumeCone(double radius, double height)
Все эти методы обязаны:

Быть статическими (static).
Принимать нужные размеры через параметры.
Возвращать результат через return.
Использовать тип double для вычислений.

2. Вспомогательные методы

Напиши ещё два метода:

displayResult(String name, double volume) — выводит на экран название фигуры и посчитанный объём.
invalidMeasurements() — выводит сообщение об ошибке, если хоть одно введённое значение отрицательное.
Оба метода должны быть статическими и ничего не возвращать (void).

3. Основная программа

Метод main() должен делать следующее:

Показывать меню с вариантами.
Спрашивать у пользователя, объём какой фигуры он хочет посчитать.
Запрашивать нужные размеры для каждой фигуры.
Вызывать подходящий метод расчёта.
Показывать результат методом showResult() (примечание: в пункте B метод называется displayResult — уточни, как правильно).
Проверять, что ни одно измерение не отрицательное.
Позволять делать сколько угодно расчётов подряд, не перезапуская программу.
Завершаться, когда пользователь выбирает пункт 0.

4. Обязательные управляющие конструкции

Цикл do-while: чтобы меню повторялось, пока пользователь не выберет пункт 0.
Оператор switch: для обработки пунктов меню.
Конструкции if-else: для проверки корректности введённых размеров.
Статические методы: для расчётов и вспомогательных операций.

5. Класс Math

В расчётах обязательно использовать:

Math.pow() — для возведения в степень.
Math.PI — для числа π.
Заменять методы расчёта «голыми» формулами прямо внутри case в switch нельзя.

6. Проверки (валидация)

Программа должна корректно обрабатывать такие ситуации:

Если пользователь ввёл отрицательное значение — показывается сообщение об ошибке, расчёт не выполняется.
Если ввёл 0 — можно выполнить расчёт, объём будет равен нулю.
Если выбрал несуществующий пункт меню — выводится сообщение, что такого варианта нет.
После расчёта или ошибки программа возвращается в главное меню.
Если выбран пункт 0 — выводится прощальное сообщение, и программа завершает работу.
