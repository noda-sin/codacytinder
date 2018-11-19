package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "T", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$typeParameters$2 extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$typeParameters$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @NotNull
    public final List<KTypeParameterImpl> invoke() {
        List declaredTypeParameters = this.this$0.getDescriptor().getDeclaredTypeParameters();
        C2668g.a(declaredTypeParameters, "descriptor.declaredTypeParameters");
        Iterable<TypeParameterDescriptor> iterable = declaredTypeParameters;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TypeParameterDescriptor kTypeParameterImpl : iterable) {
            arrayList.add(new KTypeParameterImpl(kTypeParameterImpl));
        }
        return (List) arrayList;
    }
}