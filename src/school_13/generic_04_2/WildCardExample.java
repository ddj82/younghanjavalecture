package school_13.generic_04_2;

import java.util.Arrays;

public class WildCardExample {
    /*
     * <?> 제네릭타입의 요소를 정하는 놈
     * 기준이 되게 하는 놈
     * 제네릭타입에서 와일드카드를 쓸땐 꺽세로 모아줘야하고
     * 내가 소속한 클래스가 필요하다 Course<?> 이런식
     * Course<?> => ?에는 Course클래스 안에 어떤 타입이든 어떤 자료형이든 가능
     * Course<? extends Student> => ?에는 Student포힘, Student의 자식/자손 만 가능
     * Course<? super Worker> => ?에는 Worker포함 Worker의 부모/조상 만 가능
     * super앞에는 ?(와일드카드)만 쓸 수 있다
     *
     */

    /*
     * Course<Person> personCourse = new Course<Person>("일반인과정", 5)
     * registerCourse(personCourse)
     * registerCourse(Course<?> course) => (Course<?> course) =>
     * Course<?> => Course<Person>
     * course => personCourse
     * => registerCourse(Course<Person> personCourse)
     */

    public static void registerCourse(Course<?> course) {
        /*
         * course.getName() => 일반인과정
         *  + " 수강생: " +
         *  Arrays.toString()는 toString()에 course.getStudents()를 오버라이딩 해서 무튼 이거 출력임
         *  course.getStudents() =>
         *  [new Person("일반인")의 주소값(&10), new Worker("직장인")의 주소값(&20), new Student("학생")의 주소값(&30), new HighStudent("고등학생")의 주소값(&40), null]
         *  출력 후 registerCourse(personCourse); 끝
         */

        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents())); //Arrays.toString(배열객체) 배열의 값을 출력해라
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));
        registerCourse(personCourse);

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));
        registerCourse(workerCourse);

        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));
        registerCourse(studentCourse);

        Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정", 5);
        highstudentCourse.add(new HighStudent("고등학생"));
        registerCourse(highstudentCourse);

        System.out.println();

//		registerCourseStudent(personCourse);		(x)
//		registerCourseStudent(workerCourse);		(x)
        registerCourseStudent(studentCourse);
        registerCourseStudent(highstudentCourse);
        System.out.println();


        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);		(x)
//		registerCourseWorker(highstudentCourse);	(x)
    }

}