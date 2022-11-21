public class Fio {
    private int mvLastIndex = 0;

    public String getSurname(String ivFullFio) {
        //Начальный индекс для Фамилии
        int lvBegInd = 0;

        //Конечноый индекс для Фамилии
        this.mvLastIndex = ivFullFio.indexOf(' ');

        // Считать строку между индексами
        String rvSurname = ivFullFio.substring(lvBegInd, this.mvLastIndex);

        return rvSurname.trim();
    }

    public String getName(String ivFullFio) {
        //Начальный индекс для Фамилии
        int lvBegInd = this.mvLastIndex + 1;

        //Конечный индекс для Фамилии
        this.mvLastIndex = ivFullFio.indexOf(' ', lvBegInd);

        // Считать строку между индексами
        String rvName = ivFullFio.substring(lvBegInd, this.mvLastIndex);

        return rvName.trim();
    }

    public String getPatronymic(String ivFullFio) {
        //Начальный индекс для Фамилии
        int lvBegInd = this.mvLastIndex + 1;

        //Конечный индекс для Фамилии
        this.mvLastIndex = ivFullFio.length();

        // Считать строку между индексами
        String rvPatronymic = ivFullFio.substring(lvBegInd, this.mvLastIndex);

        return rvPatronymic.trim();
    }
}
