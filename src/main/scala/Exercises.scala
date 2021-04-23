object Exercises {

    /*ПРИМЕР*/
    /*Реализовать функцию, которая возвращает все целые числа в заданном диапазоне (от iForm до iTo), которые делятся
    на 3 или на 7.*/
    /*Реализовать юнит-тесты в src/test/scala для данной функции.*/
    def divBy3Or7(iFrom: Int, iTo: Int): Seq[Int] = {
        for {i <- iFrom to iTo
             if i % 3 == 0 || i % 7 == 0
        } yield i
    }



    /*ЗАДАНИЕ I*/
    /*Реализовать функцию, которая возвращает сумму всех целых чисел в заданном диапазоне (от iForm до iTo), которые делятся
    на 3 или на 5.*/
    /*Реализовать юнит-тесты в src/test/scala для данной функции.*/

    def sumOfDivBy3Or(iFrom: Int, iTo: Int): Long = {
            var summa = 0
            for (i <- iFrom to iTo) {
                if (i % 3 == 0 || i % 5 == 0) {
                    summa = summa + i
                }

            }
            summa.toLong
        }
    }




