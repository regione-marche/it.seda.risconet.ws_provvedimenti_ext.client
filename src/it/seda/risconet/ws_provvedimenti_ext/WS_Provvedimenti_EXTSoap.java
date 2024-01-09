/**
 * WS_Provvedimenti_EXTSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public interface WS_Provvedimenti_EXTSoap extends java.rmi.Remote {
    public  it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWResponseExecuteRequest_NEWResult executeRequest_NEW(it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.ExecuteOperationResponseExecuteOperationResult executeOperation(it.seda.risconet.ws_provvedimenti_ext.ExecuteOperationXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.ExecuteRequestResponseExecuteRequestResult executeRequest(it.seda.risconet.ws_provvedimenti_ext.ExecuteRequestXml xml) throws java.rmi.RemoteException;
    public void test() throws java.rmi.RemoteException;
    public java.lang.String test_EP_NuovoProvvedimento_Discarico_Ext(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_EP_NuovoProvvedimento_Sospensione_Ext(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_EP_NuovoProvvedimento_RevocaSospensione_Ext(java.lang.String XML) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult EP_NuovoProvvedimento_Discarico_Ext(it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Discarico_ExtXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtResponseEP_NuovoProvvedimento_Sospensione_ExtResult EP_NuovoProvvedimento_Sospensione_Ext(it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_RevocaSospensione_ExtResponseEP_NuovoProvvedimento_RevocaSospensione_ExtResult EP_NuovoProvvedimento_RevocaSospensione_Ext(it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_RevocaSospensione_ExtXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaResponseGetNDocForPartitaResult getNDocForPartita(it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoResponseGetInfoProvvedimentoResult getInfoProvvedimento(it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoXml xml) throws java.rmi.RemoteException;
    public java.lang.String ottico_InsertFilesForMagRat(it.seda.risconet.ws_provvedimenti_ext.Ottico_InsertFilesForMagRatImxl imxl) throws java.rmi.RemoteException;
    public java.lang.String ottico_UpdateFilesForMagRat(it.seda.risconet.ws_provvedimenti_ext.Ottico_UpdateFilesForMagRatImxl imxl) throws java.rmi.RemoteException;
    public java.lang.String ottico_ListaMagRat(it.seda.risconet.ws_provvedimenti_ext.Ottico_ListaMagRatImxl imxl) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione ottico_DownloadMagRat(it.seda.risconet.ws_provvedimenti_ext.Ottico_DownloadMagRatImxl imxl) throws java.rmi.RemoteException;
    public java.lang.String test_InsertFilesForMagRat() throws java.rmi.RemoteException;
    public java.lang.String test_InsertFilesForMagRatONE(java.lang.String partefile) throws java.rmi.RemoteException;
    public java.lang.String test_InsertFilesForMagRat_CRESET() throws java.rmi.RemoteException;
    public java.lang.String test_UpdateFileForMagRat() throws java.rmi.RemoteException;
    public java.lang.String test_ListaMagRat() throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione test_DownloadMagRat() throws java.rmi.RemoteException;
    public java.lang.String test_ListaMagRatOne(java.lang.String partefile) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione test_DownloadMagRatOne(java.lang.String partefile) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione test_DownloadMagRat_CRESET() throws java.rmi.RemoteException;
    public java.lang.String test_CalcolaProvvedimentoONE(java.lang.String partefile) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione test_DownloadPropostaProvvedimento(java.lang.String partefile) throws java.rmi.RemoteException;
    public java.lang.String test_ArchiviaPianoAmmortamentoDiretto(java.lang.String partefile) throws java.rmi.RemoteException;
    public java.lang.String test_ArchiviaPianoAmmortamentoDirettoXML(java.lang.String XML) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione testTEST_DownloadPropostaProvvedimento(java.lang.String xml) throws java.rmi.RemoteException;
    public OtticoWebService.FileEstensione downloadPropostaProvvedimento(it.seda.risconet.ws_provvedimenti_ext.DownloadPropostaProvvedimentoXml xml) throws java.rmi.RemoteException;
    public java.lang.String archiviaPdfPianoAmmortamentoProvvedimento(it.seda.risconet.ws_provvedimenti_ext.ArchiviaPdfPianoAmmortamentoProvvedimentoXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoResponseCalcolaProvvedimentoResult calcolaProvvedimento(it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteResponseCheck_MRContribuenteResult check_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteResponseCancellaProposta_MRContribuenteResult cancellaProposta_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRResponseInserisciPropostaRateazione_MRResult inserisciPropostaRateazione_MR(it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteResponseRecuperoInfo_MRContribuenteResult recuperoInfo_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteResponseListaProposte_MRContribuenteResult listaProposte_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteResponseSalvaProposta_MRContribuenteResult salvaProposta_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteResponseModificaProposta_MRContribuenteResult modificaProposta_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteResponseRecuperaDettaglioProposte_MRContribuenteResult recuperaDettaglioProposte_MRContribuente(it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteXml xml) throws java.rmi.RemoteException;
    public java.lang.String test_GetNDocForPartita(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_GetInfoProvvedimento(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_CalcolaProvvedimento(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_Check_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_CancellaProposta_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_UploadPropostaMR(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_RecuperoInfo_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_SalvaProposta_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_SalvaProposta_MRContribuenteP5(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_ModificaProposta_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_ListaProposte_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public java.lang.String test_RecuperaDettaglioProposte_MRContribuente(java.lang.String XML) throws java.rmi.RemoteException;
    public  it.seda.risconet.ws_provvedimenti_ext.Test_ExecuteOperationResponseTest_ExecuteOperationResult test_ExecuteOperation(java.lang.String XML) throws java.rmi.RemoteException;
    //PAGONET-518 SB - inizio
    public  it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuente_MDResponseCheck_MRContribuente_MDResult check_MRContribuente_MD(it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuente_MDXml xml) throws java.rmi.RemoteException;
    //PAGOENT-518 SB - fine
}
