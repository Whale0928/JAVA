package etc;


import vo.For_Equals_And_HashCode_Vo;

/**해시코드 , == , equals 들을 비교해보기 위한 클래스
 * The type Hash code and equals.
 */
public class HashCode_And_Equals {
    public static void main(String[] args) {
        For_Equals_And_HashCode_Vo s1 = new For_Equals_And_HashCode_Vo();
        For_Equals_And_HashCode_Vo s2 = new For_Equals_And_HashCode_Vo();
        For_Equals_And_HashCode_Vo s3 = s1;

//        System.out.println("s1 = " + s1);
//        System.out.println("s1 = " + s1.hashCode());
//        System.out.println("s2 = " + s2);
//        System.out.println("s2 = " + s2.hashCode());

        /**
          두 객체의 메모리 주소를 비교한다

         1번은 두개가 각각 다른 객체라 메모리주소가 달라 false 가 나오지만
         2번은 1번 객체의 메모리 주소 "값"만 대입된 상태라 같은 메모리 주소를 공유한다.
          */
        System.out.println("객체를 == 비교 " +(s1 == s2));
        System.out.println("객체를 equals 비교 " +(s1.equals(s2)));

        //해시 코드 또한 객체의 값을 해시 알고리즘을 통해 추출하고 비교한다.
        //해시코드는 Int 형이라 equals 비교가 안된다
        System.out.println(" 두개의 hashCode == 비교 " +(s1.hashCode() == s2.hashCode()));

    }
}
