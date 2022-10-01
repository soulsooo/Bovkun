/**
 Слушатель.
 Каждый раз, когда меняется связанный с ним UndobleStringBuilder,
 вызывается метод onChange().
 */
interface OnStringBuilderChangeListener {
    void onChange(OvservableStringBuilder stringBuilder);
}

class OvservableStringBuilder {

    // Слушатель, которого надо будет уведомить
    private OnStringBuilderChangeListener onChangeListener;

    // делегат
    private StringBuilder stringBuilder;

    // Сеттер для onChangeListener
    public void setOnChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }

    public OvservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    // ....... Другие методы аналогично ..........

    public String toString() {
        return stringBuilder.toString();
    }
}

/**
 Конкретная реализация OnStringBuilderChangeListener
 */
class MyListener implements OnStringBuilderChangeListener {
    /*
        Определяем метод onChange
        В него передаётся stringBuilder, который "прослушивается"
     */
    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}

public class Main {
    public static void main(String[] strings) {
        OvservableStringBuilder undobleStringBuilder =
                new OvservableStringBuilder();
        undobleStringBuilder.setOnChangeListener(new MyListener());
        undobleStringBuilder.append("Hello");
        undobleStringBuilder.append(", ");
        undobleStringBuilder.append("World!");
    }
}