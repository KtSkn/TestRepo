class Test{

	public static void main(String[] args){
    System.out.println("hello world");
    Test2 tes2 = new Test2();
    Test3 tes3 = new Test3();
    Test4 tes4 = new Test4();
    int ans2 = tes2.num();
    int ans3 = tes3.num();
		int ans4 = tes4.num();
    System.out.println(ans2);
    System.out.println(ans3);
    System.out.println(ans4);

    for (int i=0;i<=10 ;i++ ) {
      System.out.println("num" + i);

    }
	}
}

class Test2{

	public int num(){
	  return 1;
 	}
}

class Test3 {

  public int num(){
    return 2;
  }
}

class Test4 {

  public int num(){
    return 3;
  }
}
