package hcute.hoo.design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    // 开放钩子的控制权限
    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供前端课程的源代码");
        System.out.println("提供前端课程的多媒体素材");
    }

    @Override
    protected boolean needWriteArtilce() {
        return this.needWriteArticleFlag;
    }
}
