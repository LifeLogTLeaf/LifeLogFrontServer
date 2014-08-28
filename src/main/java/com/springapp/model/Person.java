package com.springapp.model;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

/**
 * 컨버젼을 사용해서 객체를 json화 시킨다.
 * 헤쉬맵을 써서 사용해서 데이터를 유연하게 변경시킬 수 있다.
 * { 예를들면 person에서 필드값이 하나 빠지면 새로운 클래스를 생성해야 하니
 *   해쉬맵으로 해서 하면 된다. }
 * Created by jangyoungjin on 7/25/14.
 */

@JsonWriteNullProperties(false)
@JsonIgnoreProperties({"id", "revision"})
public class Person {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_rev")
    private String revision;

    private String name;
    private String age;

    public Person(){
        super();
    }

    public Person(String name, String age){
        super();
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person (id : " + id + ", "
                     + "rev : " + revision + ", "
                     + "name : " + name + ", "
                     + "age : " + age + ") ";
    }

}
