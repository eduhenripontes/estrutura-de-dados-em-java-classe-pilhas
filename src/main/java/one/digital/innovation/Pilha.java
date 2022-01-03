package one.digital.innovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No Push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);

    }

    public No Pop(){
        if(this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null

    }
    public No top(){
       return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        if (refNo == null) {
            return true;
        } else return false;
        //return refNo == null ? true: false;
    }
}
