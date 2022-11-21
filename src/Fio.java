public class Fio {
    public static final String MC_SURNAME = "Surname";
    public static final String MC_NAME = "Name";
    public static final String MC_PATRONYMIC = "Patronymic";
    private int mvLastIndex = 0;

    public String separFio(String ivFullFio, String ivVariant) {
        int lvBegInd = 0;

        //Начальный индекс для Фамилии
        switch (ivVariant) {
            case MC_SURNAME:
                //Начальный индекс для Фамилии
                lvBegInd = this.mvLastIndex;

                //Конечный индекс для Фамилии
                this.mvLastIndex = ivFullFio.indexOf(' ');
                break;
            case MC_NAME:
                //Начальный индекс для Фамилии
                lvBegInd = this.mvLastIndex + 1;

                //Конечный индекс для Фамилии
                this.mvLastIndex = ivFullFio.indexOf(' ', lvBegInd);
                break;
            case MC_PATRONYMIC:
                //Начальный индекс для Фамилии
                lvBegInd = this.mvLastIndex + 1;

                //Конечный индекс для Фамилии
                this.mvLastIndex = ivFullFio.length();
                break;
        }
        // Считать строку между индексами
        String rvFio = ivFullFio.substring(lvBegInd, this.mvLastIndex);

        return rvFio.trim();
    }
}