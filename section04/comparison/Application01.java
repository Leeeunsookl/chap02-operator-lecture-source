package com.ohgiraffers.section04.comparison;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
        *   비교연산자
        *   비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *   연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        *   많이 사용된다는 것은 많이 연습해야 된다는 것이다!!!
        *   */

        /* 필기.
        *   비교연산자의 종류
        *   '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
        *   '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
        *   '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면  true 아니면 false를 반환
        *   '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면  true 아니면 false를 반환
        *   '<' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면  true 아니면 false를 반환
        *   '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면  true 아니면 false를 반환
        *   */      //자바언어에서 부정의 의미는 느낌표로 쓴다

        /* 목차. 1. 숫자값 비교 */
        /* 목차. 1-1. 정수 비교 */
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("=================정수값 비교===================");
        System.out.println("inum1과 inum2과 같은 지 비교 ;" + (inum1 == inum2));
        System.out.println("inum1과 inum2과 같지 않은지 비교 ;" + (inum1 != inum2));
        // 구분선
        System.out.println("inum1이 inum2 보다 큰 지 비교 ;" + (inum1 > inum2));
        System.out.println("inum1이 inum2과 보다 크거나 같은지 비교 ;" + (inum1 >= inum2));
        System.out.println("inum1이 inum2과 작은지 비교 ;" + (inum1 < inum2));
        System.out.println("inum1이 inum2과 작거나 같은지 비교 ;" + (inum1 <= inum2));

        /* 목차. 2. 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("===================문자 값 비교====================");
        System.out.println("ch1 과 ch2 가 같은 지 비교 : " + (ch1 == ch2));
        System.out.println("ch1 과 ch2 가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1 이 ch2 보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1 이 ch2 보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1 이 ch2 보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1 이 ch2 보다 작거나 같은지 비교 : " + (ch1 <= ch2));

        /* 목차. 3. 논리값 비교 */
         boolean bool1 = true;
         boolean bool2 = false;
         /* 필기. 논리 값은 == 과 != 은 비교가 가능하지만, 대소비교는 불가능하다. */
        System.out.println("======================논리값 비교=========================");
        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 != bool2));
        System.out.println("========================================================");
//        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 > bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 >= bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 < bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교" + (bool1 <= bool2));

        /* 목차. 4. 문자열 값 비교 */
        /* 필기. 문자열도 == 과 != 은 비교가 가능하지만 대소 비교는 불가능하다. */
        String str1 = "java";
        String str2 = "java";

        System.out.println("=======================문자열 값 비교========================");
        System.out.println("str1과 str2가 같은지 비교" + (str1 == str2));
        System.out.println("str1과 str2가 다른지 비교" + (str1 != str2));
        System.out.println("===========================================================");
//        System.out.println("str1과 str2가 다른지 비교" + (str1 > str2));
//        System.out.println("str1과 str2가 다른지 비교" + (str1 >= str2));
//        System.out.println("str1과 str2가 다른지 비교" + (str1 < str2));
//        System.out.println("str1과 str2가 다른지 비교" + (str1 <= str2));

    }

}
