package com.gyanly.travelbookin.utilities;

import com.gyanly.travelbookin.domain.TrainTicket;
import com.gyanly.travelbookin.domain.TravelTicket;

import java.util.Comparator;

public class OriginSortComparator implements Comparator<TravelTicket> {

    @Override
    public int compare(TravelTicket o1, TravelTicket o2) {
        return o1.getOrigin().compareTo(o2.getOrigin());
    }
}
