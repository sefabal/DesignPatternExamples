package ceng.anadolu.bim492;

public interface Command {

    void execute(ItemComponent item);

    void undo();

    void redo();

}
