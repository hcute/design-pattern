package hcute.hoo.design.pattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        Article article = new Article("与影随行的设计模式A", "设计模式A", "图片A");
        System.out.println("原始手记：" + article);
        ArticleMemento articleMemento = article.saveToMemento(article);

        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        articleMementoManager.addArticleMemento(articleMemento);

        article.setTitle("与影随行的设计模式B");
        article.setContent("设计模式B");
        article.setImg("图片B");
        System.out.println("第一次修改后手记：" + article);
        ArticleMemento articleMemento1 = article.saveToMemento(article);
        articleMementoManager.addArticleMemento(articleMemento1);

        article.setTitle("与影随行的设计模式C");
        article.setContent("设计模式C");
        article.setImg("图片c");
        System.out.println("第二次修改后手记：" + article);

        ArticleMemento articleMemento2 = article.saveToMemento(article);
        articleMementoManager.addArticleMemento(articleMemento2);


        ArticleMemento articleMemento3 = articleMementoManager.getArticleMemento();
        article.undoFromMemento(articleMemento3);
        System.out.println("undo第一次：" + article);

        ArticleMemento articleMemento4 = articleMementoManager.getArticleMemento();
        article.undoFromMemento(articleMemento4);
        System.out.println("undo第二次：" + article);

        ArticleMemento articleMemento5 = articleMementoManager.getArticleMemento();
        article.undoFromMemento(articleMemento5);
        System.out.println("undo第三次：" + article);
    }
}
