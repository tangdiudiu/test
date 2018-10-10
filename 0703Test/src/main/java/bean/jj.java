package bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wc.jia on 2018/7/16.
 */
public class jj
{
    @Autowired
    Person person;
    public void getpeople(){
        person.getAge();
        person.getName();
    }
}