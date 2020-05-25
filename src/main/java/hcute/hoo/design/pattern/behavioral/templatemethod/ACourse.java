package hcute.hoo.design.pattern.behavioral.templatemethod;

public abstract class ACourse {

    /**
     * 定义一个流程：不能被改变，但是内部方法可以改变
     */
    protected final void makeCourse(){
        makePPT();
        makeVideo();
        if (needWriteArtilce()) {
            writeArticle();
        }
        packageCourse();
    }

    /**
     * 共同且不可变,就应该添加final修饰
     */
    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    // 钩子方法 是否需要写手记的钩子
    protected boolean needWriteArtilce(){
        return false;
    }

    /**
     * 打包课程
     */
    abstract void packageCourse();
}
