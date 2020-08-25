package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.Appender;
import OOP.SOLID.LOGGER.Logger.interfaces.Layout;

public abstract class AbstractAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;
    private int appendsCount;

    public AbstractAppender(ReportLevel reportLevel,Layout layout){
        this.reportLevel = reportLevel;
        this.layout = layout;
    }

    public AbstractAppender(Layout layout){
        this(ReportLevel.INFO, layout);
    }


    protected Layout getLayout() {
        return layout;
    }

    @Override
    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

   protected abstract String getType();

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("Appender type: ");
        builder.append(this.getType())
                .append(", Layout type: ")
                .append(this.layout.getType())
                .append(", ")
                .append(String.format("Report level: %s, ",getReportLevel().toString()))
                .append("Messages appended: ")
                .append(this.appendsCount);

        return builder.toString();
    }

    protected void incrementAppendsCount(){
        this.appendsCount++;
    }

}
