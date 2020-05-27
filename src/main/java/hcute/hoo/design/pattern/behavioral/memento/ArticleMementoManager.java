package hcute.hoo.design.pattern.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private static final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public void addArticleMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

    public ArticleMemento getArticleMemento(){
        return ARTICLE_MEMENTO_STACK.pop();
    }
}
