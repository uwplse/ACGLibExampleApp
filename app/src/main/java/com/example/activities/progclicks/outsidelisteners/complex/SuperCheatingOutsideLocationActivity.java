package com.example.activities.progclicks.outsidelisteners.complex;

import android.support.annotation.NonNull;
import com.acg.EvilApp.R;
import com.example.evildoers.EvilDoer;
import com.example.evildoers.progclicks.simple.ProgClickEvilDoer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Programmatically click a button whose listener invokes several buttons and eventually invokes an ACG
 * The listeners are in an external class
 */
public class SuperCheatingOutsideLocationActivity extends VeryIndirectOutsideLocationActivity {

    @NonNull
    @Override
    public Collection<EvilDoer> evilDoers() {
        List<EvilDoer> evilDoers = new ArrayList<>(super.evilDoers());
        evilDoers.add(new ProgClickEvilDoer(R.id.malicious_disguised_button_id_5));
        return evilDoers;
    }
}
