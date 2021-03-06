package com.tinder.chat.view.message;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.view.action.C8458c;
import com.tinder.chat.view.action.ac;
import com.tinder.chat.view.action.ae;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.common.feed.view.FeedImageContentView;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0000XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$¨\u00064"}, d2 = {"Lcom/tinder/chat/view/message/OutboundFeedInstagramImageView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/chat/view/message/BindableChatItemView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bubbleDrawableId", "", "getBubbleDrawableId$Tinder_release", "()I", "imageClickHandler", "Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "getImageClickHandler$Tinder_release", "()Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "setImageClickHandler$Tinder_release", "(Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;)V", "imageContentView", "Lcom/tinder/common/feed/view/FeedImageContentView;", "getImageContentView$Tinder_release", "()Lcom/tinder/common/feed/view/FeedImageContentView;", "mediaUnavailableHandler", "Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;", "getMediaUnavailableHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;", "setMediaUnavailableHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundActivityMessageMediaUnavailableHandler;)V", "messageActionHandler", "Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "getMessageActionHandler$Tinder_release", "()Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "setMessageActionHandler$Tinder_release", "(Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;)V", "textMessageContentView", "Landroid/widget/TextView;", "getTextMessageContentView$Tinder_release", "()Landroid/widget/TextView;", "textSize", "", "getTextSize$Tinder_release", "()F", "timestampFormatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "getTimestampFormatter$Tinder_release", "()Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "setTimestampFormatter$Tinder_release", "(Lcom/tinder/chat/view/message/MessageTimestampFormatter;)V", "timestampView", "getTimestampView$Tinder_release", "bind", "", "viewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ak extends RelativeLayout implements BindableChatItemView<C12747i> {
    @Inject
    @NotNull
    /* renamed from: a */
    public ae f34514a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8490z f34515b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C8458c f34516c;
    @Inject
    @NotNull
    /* renamed from: d */
    public ac f34517d;
    /* renamed from: e */
    private final float f34518e = au.a(this, R.dimen.text_s);
    @DrawableRes
    /* renamed from: f */
    private final int f34519f = R.drawable.chat_message_outbound_bubble_background_batch_start;
    @NotNull
    /* renamed from: g */
    private final TextView f34520g;
    @NotNull
    /* renamed from: h */
    private final TextView f34521h;
    @NotNull
    /* renamed from: i */
    private final FeedImageContentView f34522i;
    /* renamed from: j */
    private HashMap f34523j;

    /* renamed from: a */
    public View m42735a(int i) {
        if (this.f34523j == null) {
            this.f34523j = new HashMap();
        }
        View view = (View) this.f34523j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f34523j.put(Integer.valueOf(i), view);
        return view;
    }

    public ak(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        Context a = C14398a.a(context);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        View.inflate(context, R.layout.chat_activity_feed_outbound_image_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        TextView textView = (TextView) m42735a(C6248a.chatTextMessageContent);
        C2668g.a(textView, "chatTextMessageContent");
        this.f34520g = textView;
        textView = (TextView) m42735a(C6248a.chatMessageTimestamp);
        C2668g.a(textView, "chatMessageTimestamp");
        this.f34521h = textView;
        FeedImageContentView feedImageContentView = (FeedImageContentView) m42735a(C6248a.chatActivityFeedImageContainer);
        C2668g.a(feedImageContentView, "chatActivityFeedImageContainer");
        this.f34522i = feedImageContentView;
    }

    public /* synthetic */ void bind(ChatItem chatItem) {
        m42736a((C12747i) chatItem);
    }

    @NotNull
    public final ae getMessageActionHandler$Tinder_release() {
        ae aeVar = this.f34514a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        return aeVar;
    }

    public final void setMessageActionHandler$Tinder_release(@NotNull ae aeVar) {
        C2668g.b(aeVar, "<set-?>");
        this.f34514a = aeVar;
    }

    @NotNull
    public final C8490z getTimestampFormatter$Tinder_release() {
        C8490z c8490z = this.f34515b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        return c8490z;
    }

    public final void setTimestampFormatter$Tinder_release(@NotNull C8490z c8490z) {
        C2668g.b(c8490z, "<set-?>");
        this.f34515b = c8490z;
    }

    @NotNull
    public final C8458c getImageClickHandler$Tinder_release() {
        C8458c c8458c = this.f34516c;
        if (c8458c == null) {
            C2668g.b("imageClickHandler");
        }
        return c8458c;
    }

    public final void setImageClickHandler$Tinder_release(@NotNull C8458c c8458c) {
        C2668g.b(c8458c, "<set-?>");
        this.f34516c = c8458c;
    }

    @NotNull
    public final ac getMediaUnavailableHandler$Tinder_release() {
        ac acVar = this.f34517d;
        if (acVar == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        return acVar;
    }

    public final void setMediaUnavailableHandler$Tinder_release(@NotNull ac acVar) {
        C2668g.b(acVar, "<set-?>");
        this.f34517d = acVar;
    }

    public final float getTextSize$Tinder_release() {
        return this.f34518e;
    }

    public final int getBubbleDrawableId$Tinder_release() {
        return this.f34519f;
    }

    @NotNull
    public final TextView getTextMessageContentView$Tinder_release() {
        return this.f34520g;
    }

    @NotNull
    public final TextView getTimestampView$Tinder_release() {
        return this.f34521h;
    }

    @NotNull
    public final FeedImageContentView getImageContentView$Tinder_release() {
        return this.f34522i;
    }

    /* renamed from: a */
    public void m42736a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        ae aeVar = this.f34514a;
        if (aeVar == null) {
            C2668g.b("messageActionHandler");
        }
        ad.m36271a(this, c12747i, aeVar);
        C8490z c8490z = this.f34515b;
        if (c8490z == null) {
            C2668g.b("timestampFormatter");
        }
        ah.m36314a(this, c12747i, c8490z);
        C8458c c8458c = this.f34516c;
        if (c8458c == null) {
            C2668g.b("imageClickHandler");
        }
        ac acVar = this.f34517d;
        if (acVar == null) {
            C2668g.b("mediaUnavailableHandler");
        }
        ac.m36251a(this, c12747i, c8458c, acVar);
    }
}
