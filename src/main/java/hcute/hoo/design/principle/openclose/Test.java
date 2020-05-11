package hcute.hoo.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
//        JavaCourse javaCourse = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
//        System.out.println(javaCourse);
        JavaCourse javaCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println("课程id:" + discountCourse.getId() + ",课程名称:" + discountCourse.getName()+ "课程的原价:"
                + discountCourse.getOriginPrice() + ",课程折扣价:" + discountCourse.getPrice());
    }
}
