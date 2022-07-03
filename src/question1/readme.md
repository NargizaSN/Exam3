Задача 1. Создать массив, заполнить его значениями от 1 до 100. 
Перенести чётные числа из массива в HashSet. 
При переносе в HashSet соблюсти правило - в начале должны быть числа, 
которые делятся на 5 без остатка, а в конце те, что не делятся

Подсказка: Возможно ли сделать последний пункт, если да то как?

Ответ: Так как в HashSet нет сортировки, мы решили проблему следующим способом:
1. Заранее отсортировали массив 
2. Пробовала добавить отсортированный массив в HashSet, но числа добавились от 2х до 100 
в порядке возрастания, т.к. HashSet добавляет по hashcode, а не по порядку.
3. Использовали LinkedHashSet вместо HashSet. 


