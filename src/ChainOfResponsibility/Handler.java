package ChainOfResponsibility;

public abstract class Handler<T> {
    protected Handler<T> nextHandler;
    protected int processingParam;

    public Handler(int processingParam) {
        this.processingParam = processingParam;
    }

    public T handleRequest(T t) {
        if (t != null) {
            t = logic(t);
        } else t = nullAttributeLogic(t);
        if (nextHandler != null)
            return nextHandler.handleRequest(t);
        return t;
    }

    abstract T logic(T t);

    abstract T nullAttributeLogic(T t);

    public void setNextHandler(Handler<T> nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setProcessingParam(int processingParam) {
        this.processingParam = processingParam;
    }
}
