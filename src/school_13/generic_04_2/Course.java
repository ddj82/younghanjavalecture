package school_13.generic_04_2;

public class Course<T> {
    private String name;
    private T[] students; //private Person[] students


    /*
     * personCourse = new Course<Person>("일반인과정", 5)
     * <T> = <Person>
     * "일반인과정", 5
     * private String name = "일반인과정"
     * students = (Person[])(new Object[5])
     * private Person[] students = (Person[])(new Object[5])
     *
     * personCourse.add(new Person("일반인"))
     * new Person("일반인") => Person의 private String name = 일반인
     * students[0] = null => students[0] = t => t = new Person("일반인")의 주소값(&10)
     *
     * personCourse.add(new Worker("직장인"))
     * new Worker("직장인") => super생성자 => 부모Person의 private String name = 직장인
     * students[1] = null => students[1] = t => t = new Worker("직장인")의 주소값(&20)
     *
     * personCourse.add(new Student("학생"))
     * new Student("학생") => super생성자 => 부모Person의 private String name = 학생
     * students[2] = null => students[2] = t => t = new Student("학생")의 주소값(&30)
     *
     * personCourse.add(new HighStudent("고등학생"))
     * new HighStudent("고등학생") => super생성자 => 부모Student생성자 =>
     * 조부모Person의 private String name = 고등학생
     * students[3] = null => students[3] = t => t = new HighStudent("고등학생")의 주소값(&40)
     *
     *
     **/

    public Course(String name, int capacity) { //public Course("일반인과정", 5)
        this.name = name; //this.name = "일반인과정"
        students = (T[])(new Object[capacity]); //students = (Person[])(new Object[5]);
    }
    public String getName() {
        return name;
    }
    public T[] getStudents() { //public Person[] getStudents()
        return students;
    }

    public void add(T t) { //public void add(Person t)
        /*
         * Course<Person> personCourse = new Course<Person>("일반인과정", 5)에서
         * t = new Person("일반인")의 주소값(&10)
         * t = new Worker("직장인")의 주소값(&20)
         * t = new Student("학생")의 주소값(&30)
         * t = new HighStudent("고등학생")의 주소값(&40)
         *
         */
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}