package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class mk implements Creator<zzavf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzavf(i, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzavf[i];
    }
}
