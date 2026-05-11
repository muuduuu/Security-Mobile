package co.hyperverge.hypersnapsdk.data.remote;

import De.InterfaceC0818b;
import Fe.f;
import Fe.j;
import Fe.l;
import Fe.o;
import Fe.q;
import Fe.r;
import Fe.y;
import Td.A;
import Td.E;
import Td.G;
import java.util.Map;

/* loaded from: classes.dex */
public interface ApiInterface {
    @o
    InterfaceC0818b<G> checkSessionCall(@y String str, @j Map<String, String> map, @Fe.a E e10);

    @o
    InterfaceC0818b<G> consentIsEnabled(@y String str, @j Map<String, String> map);

    @o
    @l
    InterfaceC0818b<G> encryptedOcrCall(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @q A.c cVar4);

    @o
    @l
    InterfaceC0818b<G> encryptedOcrPlusQRCall(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @q A.c cVar4, @q A.c cVar5);

    @f
    InterfaceC0818b<G> ipAddressToGeo(@y String str, @j Map<String, String> map);

    @o
    InterfaceC0818b<G> matchingAPI(@y String str, @j Map<String, String> map, @Fe.a E e10);

    @o
    @l
    InterfaceC0818b<G> ocrCall(@y String str, @j Map<String, String> map, @q A.c cVar, @r Map<String, E> map2);

    @o
    @l
    InterfaceC0818b<G> ocrPlusQRCall(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @r Map<String, E> map2);

    @o
    InterfaceC0818b<G> saveConsent(@y String str, @j Map<String, String> map, @Fe.a E e10);

    @o
    @l
    InterfaceC0818b<G> singleImageUpload(@y String str, @j Map<String, String> map, @q A.c cVar, @r Map<String, E> map2);

    @o
    @l
    InterfaceC0818b<G> uploadEncryptedImage(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @q A.c cVar4);

    @o
    @l
    InterfaceC0818b<G> uploadEncryptedImageAndVideo(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @q A.c cVar4, @q A.c cVar5);

    @o
    @l
    InterfaceC0818b<G> uploadEncryptedImageAndVideoWithFrames(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @q A.c cVar4, @q A.c cVar5, @q A.c cVar6);

    @o
    @l
    InterfaceC0818b<G> uploadImage(@y String str, @j Map<String, String> map, @q A.c cVar, @r Map<String, E> map2);

    @o
    @l
    InterfaceC0818b<G> uploadImageAndVideo(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @r Map<String, E> map2);

    @o
    @l
    InterfaceC0818b<G> uploadImageAndVideoWithFrames(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @q A.c cVar3, @r Map<String, E> map2);

    @o
    InterfaceC0818b<G> validationAPICall(@y String str, @j Map<String, String> map, @Fe.a E e10);

    @o
    @l
    InterfaceC0818b<G> verifyAlignment(@y String str, @j Map<String, String> map, @q A.c cVar, @r Map<String, E> map2);

    @o
    @l
    InterfaceC0818b<G> verifyPair(@y String str, @j Map<String, String> map, @q A.c cVar, @q A.c cVar2, @r Map<String, E> map2);
}
