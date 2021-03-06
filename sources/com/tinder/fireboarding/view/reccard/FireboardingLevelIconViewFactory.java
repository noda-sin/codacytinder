package com.tinder.fireboarding.view.reccard;

import android.content.Context;
import android.view.View;
import com.tinder.fireboarding.domain.Level;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;", "", "create", "Landroid/view/View;", "context", "Landroid/content/Context;", "level", "Lcom/tinder/fireboarding/domain/Level;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public interface FireboardingLevelIconViewFactory {
    @NotNull
    View create(@NotNull Context context, @NotNull Level level);
}
