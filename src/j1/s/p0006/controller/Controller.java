package j1.s.p0006.controller;

import j1.s.p0006.model.SearchArray;
import j1.s.p0006.view.Show;

public class Controller {
    private final Show ui = new Show();

    public void start() {
        int n = ui.askArraySize();
        int x = ui.askSearchValue();

        SearchArray sa = new SearchArray(n);
        sa.generate(10);
        sa.sort();

        ui.showSortedArray(sa.getArray());
        int idx = sa.binarySearch(x);
        ui.showFound(x, idx);
    }
}


