package org.String.MaxRep.test;
import org.String.MaxRep.classes.MaxRepChar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxRepCharTest {
  MaxRepChar mrc=new MaxRepChar();

  @Test
  public void test_valid(){
    mrc.userinput="HELLO";
    System.out.println("Input - "+mrc.userinput);
    Assert.assertEquals(mrc.findmax(),'L');
  }

  @Test(expectedExceptions = RuntimeException.class)
  public void test_empty() {
    mrc.userinput = "";
    System.out.println("Input - "+mrc.userinput);
    System.out.println(mrc.findmax());
  }

  @Test
  public void specialCharacters(){
    mrc.userinput="Hel****OMy###";
    System.out.println("Input - "+mrc.userinput);
    Assert.assertEquals(mrc.findmax(),'*');
  }

  @Test
  public void norepeat(){
    mrc.userinput="MANGO";
    System.out.println("Input - "+mrc.userinput);
    Assert.assertEquals(mrc.findmax(),'M');
  }

  @Test
  public void smallLetters(){
    mrc.userinput="hello";
    System.out.println("Input - "+ mrc.userinput);
    Assert.assertEquals(mrc.findmax(),'l');
  }

  @Test
  public void mixture(){
    mrc.userinput="HeLLo%%%HoZ";
    System.out.println("Input - " +mrc.userinput);
    Assert.assertEquals(mrc.findmax(),'%');
  }

  @Test
  public void stringWithSpaces(){
    mrc.userinput="He    LLO";
    System.out.println("Input - "+mrc.userinput);
    Assert.assertEquals(mrc.findmax(),' ');
  }
}