package enums;
enum Month {

  JANUARY(31, "enero"),
  FEBRUARY(28, "febrero"),
  MARCH(31,"marzo"),
  APRIL(30,  "abril"),
  MAY(31,  "mayo" ),
  JUNE(30,  "junio" ),
  JULY(31, "julio" ),
  AUGUST(31,  "agosto"),
  SEPTEMBER(30,  "septiembre"),
  OCTOBER(31,  "octubre"),
  NOVEMBER(30,  "noviembre"),
  DECEMBER(31, "diciembre");

  private int maxLength;
  private String name;

  private Month(int maxLength, String name) {

    this.maxLength = maxLength;
    this.name = name;
  }
  
  public int getMaxLength() {
	    return maxLength;
	  }
  
  
}
