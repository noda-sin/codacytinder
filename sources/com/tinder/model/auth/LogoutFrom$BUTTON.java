package com.tinder.model.auth;

import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/model/auth/LogoutFrom$BUTTON;", "Lcom/tinder/model/auth/LogoutFrom;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class LogoutFrom$BUTTON extends LogoutFrom {
    public static final LogoutFrom$BUTTON INSTANCE = new LogoutFrom$BUTTON();

    private LogoutFrom$BUTTON() {
        super(AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON, null);
    }
}
