package com.tinder.common.p196h;

import com.tinder.main.Badgeable;
import com.tinder.main.Badgeable$Trigger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/common/rx/AbstractBadgeable;", "Lcom/tinder/main/Badgeable;", "()V", "addTrigger", "", "trigger", "Lcom/tinder/main/Badgeable$Trigger;", "hideBadge", "removeTrigger", "showBadge", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.h.a */
abstract class C10673a implements Badgeable {
    public void addTrigger(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "trigger");
    }

    public void hideBadge() {
    }

    public void removeTrigger(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "trigger");
    }

    public void showBadge() {
    }
}