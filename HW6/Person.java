package HW6;

public class Person {
    //Задача №1. //Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод -
    // getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ”
    // если женский.
    //Задача №2
    //
    //Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
    // Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника
    // у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
String name;
int age;
String gender;

String getName (){
    if (gender.equals("M") || gender.equals("m")){
        return "Mr. " + name;
    } else {
        return "Mrs. " + name;
    }
}
}
