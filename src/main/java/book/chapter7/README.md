# Изучение 7 главы книги.

## Вопросы:
1. Дать определение функционального интерфейса. default & static методы. Область применения. Каким образом вызываются?

Ответ:
Функциональный интерфейс в Java - это интерфейс, который содержит только один абстрактный метод. Он предназначен для 
использования с лямбда-выражениями или методами ссылок. Функциональные интерфейсы позволяют вам передавать поведение в 
виде аргументов методов или хранить их в переменных.

Default-методы были введены в Java 8 для предоставления реализации по умолчанию в интерфейсах. Они позволяют добавлять 
новые методы в интерфейсы, не нарушая существующие реализации. Классы, реализующие интерфейс, могут использовать или 
переопределить default-методы.

Static-методы в интерфейсах также были добавлены в Java 8. Они могут иметь только реализацию по умолчанию и не могут 
быть переопределены в классах, реализующих интерфейс. Static-методы используются для предоставления утилитарных методов,
которые могут быть вызваны независимо от конкретной реализации интерфейса.

Область применения функциональных интерфейсов, default-методов и static-методов в Java заключается в облегчении 
разработки кода с использованием интерфейсов. Они позволяют создавать более гибкие и расширяемые интерфейсы, добавлять 
новую функциональность в существующие интерфейсы без нарушения обратной совместимости, а также упрощать работу с 
лямбда-выражениями.

Для вызова default-методов и static-методов интерфейсов используются следующие способы:
1. Вызов default-метода: Если у вас есть экземпляр класса, реализующего интерфейс, вы можете вызвать default-метод,
используя этот экземпляр:

`InterfaceName.super.defaultMethodName();`
2. Вызов static-метода: Вызов static-метода осуществляется непосредственно через имя интерфейса:

`InterfaceName.staticMethodName();`

2. Что такое лямбда-выражение? Его структура.

Ответ:

Лямбда-выражение в Java - это компактный способ представления анонимной функции (функции без имени) и его основной 
целью является передача поведения в качестве аргумента метода или хранение его в переменной. Лямбда-выражения в Java 
впервые были введены в версии 8 и являются частью функционального программирования в Java.
Структура лямбда-выражения состоит из трех основных компонентов:

1. Список параметров: Это список входных параметров, передаваемых в анонимную функцию. Если у лямбда-выражения нет 
параметров, вы указываете пустые скобки "()". Если у лямбда-выражения есть один параметр, скобки могут быть опущены.
Если у лямбда-выражения есть несколько параметров, они перечисляются через запятую в скобках.

2. Оператор "стрелка" ("->"): Это оператор, который разделяет список параметров и тело лямбда-выражения. Оператор
"стрелка" состоит из дефиса и знака больше "->".

3. Тело лямбда-выражения: Это блок кода, который выполняется при вызове лямбда-выражения. Тело может быть одним 
выражением или блоком кода, заключенным в фигурные скобки "{}". Если тело состоит из одного выражения, фигурные 
скобки и ключевое слово "return" могут быть опущены.

Вот примеры различных структур лямбда-выражений:

1. Лямбда-выражение без параметров:

`() -> System.out.println("Hello, world!");`
2. Лямбда-выражение с одним параметром:

`x -> x * x;`
3. Лямбда-выражение с несколькими параметрами:

`(x, y) -> x + y;`

4. Лямбда-выражение с блоком кода в теле:

```
(x, y) -> {
    int sum = x + y;
    System.out.println("Sum: " + sum);
};
```

3. Замыкание. К каким переменным есть доступ у лямбда-выражения?
```
Ответ:
```
4. Ссылка на метод. Какие существуют ссылки на методы?
```
Ответ:
```
5. Ссылка на конструктор. Как применяется?
```
Ответ:
```
6. Интерфейс Function. Его назначение. Какие существуют близкие по смыслу интерфейсы и почему можно сделать такой вывод?
```
Ответ:
```
7. Интерфейс UnaryOperator. Его назначение. Сравнить с интерфейсом Function
```
Ответ:
```
8. Интерфейс Supplier. Его назначение. Какие существуют близкие по смыслу интерфейсы и почему можно сделать такой вывод?
```
Ответ:
```
9. Интерфейс Predicate. Его назначение. Какие существуют близкие по смыслу интерфейсы и почему можно сделать такой вывод?
```
Ответ:
```
10. Интерфейс Consumer. Его назначение. Какие существуют близкие по смыслу интерфейсы и почему можно сделать такой вывод?
```
Ответ:
```
11. Интерфейс Comparator. Его назначение
```
Ответ:
```
12. Как создать собственный функциональный интерфейс?
```
Ответ:
```
13. Как сортировать список с применением лямбда-выражений?
```
Ответ:
```
14. Можно ли называть интерфейс функциональным, если при его объявлении не была применена аннотация @FunctionalInterface?
```
Ответ:
```

## Задания к главе:
1. С помощью каррирования реализовать функцию сложения двух чисел, функцию проверки строки на регулярное выражение, 
функцию разбиения строки по регулярному выражению.
- [ ] Решение задачи и Unit тесты.
2. Определить, являются ли слова анаграммами, т.е. можно ли из одного слова составить другое перестановкой букв.
- [ ] Решение задачи и Unit тесты.
3. Написать класс Пользователь с полями: id, имя, возраст, страна. Создать массив Пользователей. Отсортировать по стране и возрасту. Выбрать всех Пользователей старше заданного возраста, первая буква имени у которых начинается с заданной буквы. Получить максимальный и минимальный элемент в сгруппированном результате по возрасту.
- [ ] Решение задачи и Unit тесты.
4. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число делится без остатка на 31.
- [ ] Решение задачи и Unit тесты.
5. Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку. Написать реализацию такого интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.
- [ ] Решение задачи и Unit тесты.
6. Написать функциональный интерфейс с методом, который принимает три дробных числа: a, b, c и возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.
- [ ] Решение задачи и Unit тесты.
7. Написать класс Студент с полями имя, возраст. Создать массив Студентов. Выполнить сортировку по оценке выше 8 баллов и сортировать результат по имени.
- [ ] Решение задачи и Unit тесты.
8. Вывести количество вхождений заданного слова в тексте соответственно из файла в виде \[слово1-2, слово2-3, слово3-0].
- [ ] Решение задачи и Unit тесты.
9. Вывести коллекцию количества вхождений символа в тексте соответственно из файла.
- [ ] Решение задачи и Unit тесты.
10. Дано три разных целых числа. Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел.
- [ ] Решение задачи и Unit тесты.
11. С помощью лямбда-выражений создать метод, который на вход принимает строку, количество копий N, ограничение на общую длину L. Поставить запятые после каждого слова, сделать N копий, и если слов больше M — не выводить остальные слова.
- [ ] Решение задачи и Unit тесты.
12. Создать массив целых чисел. Убрать все четные элементы из массива и заполнить в конце нулями до прежнего размера массива.
- [ ] Решение задачи и Unit тесты.
13. Создать массив целых чисел. Используя лямбда-выражение, отсортировать массив по убыванию.
- [ ] Решение задачи и Unit тесты.
14. Определить, является ли число элементом Фибоначчи с помощью лямбдавыражений.
- [ ] Решение задачи и Unit тесты.
15. Создать N пар значений x, y, которые представляют координаты точки на плоскости. Выстроить все точки по увеличению их удаленности от начала координат, и вывести отсортированный список точек на экран в формате: (X:Y).
- [ ] Решение задачи и Unit тесты.
16. Написать функцию, которая вычисляет сумму списка аргументов произвольной длины с разными типами элементов массива.
- [ ] Решение задачи и Unit тесты.
17. С помощью лямбда-выражений определить, можно ли из длин сторон a, b, c образовать треугольник?
- [ ] Решение задачи и Unit тесты.
18. Продемонстрировать работу лямбда-выражения, которое получает входным параметром целое число x и вычисляет количество вхождений заданной цифры в этом числе.
- [ ] Решение задачи и Unit тесты.
19. Дан предикат condition и две функции ifTrue и ifFalse. Написать метод ternaryOperator, который из них построит новую функцию, возвращающую значение функции ifTrue, если предикат выполнен, и значение ifFalse иначе.
- [ ] Решение задачи и Unit тесты.
20. С помощью лямбда-выражений вычислить факториал заданного числа.
- [ ] Решение задачи и Unit тесты.
21. Дан прямоугольный треугольник с катетами a и b. С помощью лямбда-выражения найти радиус вписанной в треугольник окружности.
- [ ] Решение задачи и Unit тесты.
22. Дана строка. Вернуть строку, где сначала идут гласные, а потом согласные из заданной строки. Гласные и согласные должны быть в отсортированном порядке.
- [ ] Решение задачи и Unit тесты.
23. Написать программу, которая выводит число прописью.
- [ ] Решение задачи и Unit тесты.
24. Вывести массив NxN, заполненный по спирали в порядке возрастания.
- [ ] Решение задачи и Unit тесты.
25. Определить, является ли строка панграммой (использует каждую букву алфавита хотя бы один раз).
- [ ] Решение задачи и Unit тесты.
26. С помощью генераторов вывести первые N простых чисел.
- [ ] Решение задачи и Unit тесты.
27. Преобразовать каждый элемент списка, цену без добавленной стоимости в цену с добавленной стоимостью.
- [ ] Решение задачи и Unit тесты.
28. Дано время в 12-часовом формате в виде строки. Конвертировать время в 24-часовой формат.
- [ ] Решение задачи и Unit тесты.
29. Дан массив чисел. Построить из этих чисел двоичное дерево поиска и найти глубину этого дерева.
- [ ] Решение задачи и Unit тесты.
30. Последовательность координат вершин многоугольника задана массивом чисел. Определить, лежит ли точка внутри многоугольника.
- [ ] Решение задачи и Unit тесты.
31. С применением лямбда-выражения перевернуть входную строку.
- [ ] Решение задачи и Unit тесты.
32. С помощью лямбда-выражений разработать метод, который на вход получает массив объектов, а возвращает его уже без дубликатов.
- [ ] Решение задачи и Unit тесты.
33. Написать предикат, выбирающий имена, которые начинаются с заданной буквы.
- [ ] Решение задачи и Unit тесты.
34. Написать программу, возвращающую значения числа Пи, используя лямбда-выражения
- [ ] Решение задачи и Unit тесты.
35. Используя фильтр, создать новый массив из строк с числом символов больше заданного.
- [ ] Решение задачи и Unit тесты.
36. В массиве строк найти все строки, начинающиеся на заданный символ и состоящие из N букв.
- [ ] Решение задачи и Unit тесты.