import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeTask1 {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
       String s = "234";
       String someText = "some_text";
       int i = someText.length();
       int a = Integer.parseInt(s) + i;
       System.out.println(a);

       //---------------------------------------------------

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int b = 5;
        int c = 3;
        System.out.println((int) Math.pow((b+c),2));

        //-------------------------------------------------

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] array1 = { 1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};
        int[] array3 = new int[array1.length + array2.length + (array1.length + array2.length)/2 ];
        int count = 0;
        int count1 = 0;
        for ( int q = 0; q < array1.length; q ++) {
            array3[q] = array1[q];
            count++;
            count1++;
        }
        for ( int w = 0; w < array2.length; w ++) {
            array3[count++] = array2[w];
            count1++;
        }
       for (int y = 0; y < (array1.length + array2.length)/2; y ++)
            array3[count1++] = array1[y] * array2[y] ;

        for ( int h = 0; h < array3.length; h ++) {
            System.out.print(array3[h]+"\t");

        }


        //-------------------------------------------------

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
         String helloWorld = "Hello world";
         String newHelloWorld = helloWorld.replace('l', 'r').toUpperCase();
         System.out.println();
         System.out.println(newHelloWorld);
    }
}
