public class SortingTask extends Task{

    private final AbstractSorter sorter;

    public SortingTask(String taskID, String description, AbstractSorter sorter) {
        super(taskID, description);
        this.sorter = sorter;
    }

    @Override
    public void execute() {
        sorter.sort();
    }
}
