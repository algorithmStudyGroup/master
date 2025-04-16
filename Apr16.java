import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Apr16 { // 10825
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Student[] list = new Student[num];
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String name = str.split(" ")[0];
            int kor = Integer.parseInt(str.split(" ")[1]);
            int eng = Integer.parseInt(str.split(" ")[2]);
            int math = Integer.parseInt(str.split(" ")[3]);
            Student student = new Student(name,kor,eng,math);
            list[i] = student;
        }
        Arrays.sort(list, (Comparator<Student>) (s1, s2) -> {
            if(s1.kor != s2.kor){
                return s2.kor - s1.kor;
            }else if(s1.eng != s2.eng){
                return s1.eng - s2.eng;
            }else if(s1.mat !=s2.mat){
                return s2.mat - s1.mat;
            }else{
                return s1.name.compareTo(s2.name);
            }
        });
//        Arrays.sort(list,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.kor != o2.kor){
//                    return o1.kor - o2.kor;
//                }else if(o1.eng != o2.eng){
//                    return o1.eng - o2.eng;
//                }else if(o1.mat != o2.mat){
//                    return o1.mat - o2.mat;
//                }else{
//                    return o1.name.compareTo(o2.name);
//                }
//            }
//        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(list[i].name).append("\n");
        }
        System.out.println(sb);
    }
    static class Student {
        String name = null;
        int kor = 0;
        int eng = 0;
        int mat = 0;

        public Student(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }
}
// 일반적인 큐는 FIFO 형식의 자료구조
// PriorityQueue, 우선순위 큐는 우선순위가 높은 데이터가 먼저 나가는 자료구조
// add(): 우선순위 큐에 원소를 추가
// poll(): 첫 번째 값을 반환하고 제거, 비어있으면 null 반환
// remove(): 첫 번째 값을 반환하고 제거, 비어있으면 error 발생
// 우선순위 판단: Comparator 인터페이스를 구현하고 compare() 메서드를 오버라이드하기