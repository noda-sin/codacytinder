package com.tinder.recs.presenter;

import com.tinder.recs.provider.SuperLikeRatingStatus;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recs/provider/SuperLikeRatingStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class GridSuperLikeButtonPresenter$observeSuperLikeRatingStatus$1<T> implements Consumer<SuperLikeRatingStatus> {
    final /* synthetic */ GridSuperLikeButtonPresenter this$0;

    GridSuperLikeButtonPresenter$observeSuperLikeRatingStatus$1(GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        this.this$0 = gridSuperLikeButtonPresenter;
    }

    public final void accept(SuperLikeRatingStatus superLikeRatingStatus) {
        if (superLikeRatingStatus != null) {
            switch (superLikeRatingStatus) {
                case IN_PROGRESS:
                    this.this$0.getTarget$Tinder_release().disableSuperLike();
                    break;
                case ENDED:
                    this.this$0.getTarget$Tinder_release().enableSuperLike();
                    break;
                default:
                    break;
            }
        }
        this.this$0.currentRatingStatus = superLikeRatingStatus;
    }
}