package com.tinder.domain.experiments;

import io.reactivex.C3956a;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/tinder/domain/experiments/BucketRepository;", "", "fetchBuckets", "Lio/reactivex/Completable;", "deviceId", "", "getBuckets", "Lio/reactivex/Single;", "Lcom/tinder/domain/experiments/Buckets;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface BucketRepository {
    @NotNull
    C3956a fetchBuckets(@NotNull String str);

    @NotNull
    C3960g<Buckets> getBuckets();
}