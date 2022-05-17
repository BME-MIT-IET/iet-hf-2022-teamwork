package exploratory.employee;

import java.io.Serializable;
public class Person implements Serializable {
    private int age;
	private String name;

    public Person(String name, int age){
        this.name = name ;
        this.age = age;
    }

    public Person(String name){
        this.name = name ;
        this.age = 0;
    }


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
