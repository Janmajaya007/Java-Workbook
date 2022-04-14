
  class generic_demo {
   <T> void  genericprint (T t) {
	System.out.println(t);
}
	public static void main(String[] args) {
		generic_demo obj = new generic_demo() ;
		obj.genericprint(123);
		obj.genericprint("Janmajaya");
		obj.genericprint(158.36);

	}

}
