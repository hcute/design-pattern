package hcute.hoo.design.pattern.structural.composite;

public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程",11);
        CatalogComponent windowsCourse = new Course("windows课程",11);

        CatalogComponent javaCatalog = new CourseCatalog("java系列课程",2);

        CatalogComponent interCh1 = new Course("电商一期",55);
        CatalogComponent interCh2 = new Course("电商二期",66);
        CatalogComponent design = new Course("设计模式",77);

        javaCatalog.add(interCh1);
        javaCatalog.add(interCh2);
        javaCatalog.add(design);

        CatalogComponent mainCourseCatalog = new CourseCatalog("慕课网课程",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCatalog);

        mainCourseCatalog.print();

    }
}
