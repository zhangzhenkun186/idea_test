package com.zzk;

/**
 * 快捷键生成set和get,以及构造方法：alt+insert
 */
public class User {

	private String name;

    private int   age;

    private int   sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

    public static void main(String[] args) {
		System.out.println("测试冲突hahaha");
	}
}
