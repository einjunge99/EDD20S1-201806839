#include <iostream>
using namespace std;


class Student{
    public :
    int  identifier;
    string name;
    Student();
    Student(int _identifier,string _name){
    identifier=_identifier;
    name=_name;
    }
};




class SimpleList{
    private:
    typedef struct Node{
        Student student;
        Node* next;
    }* nodePointer;

    nodePointer head;
    
    public:


    SimpleList(){
        head=NULL;
    }

    bool isEmpty(){
        return head==NULL;
    }

    void add(int identifier, string name ){
        Student newData(identifier,name);
        nodePointer n=new Node;
        n->student=newData;
        n->next=NULL;

        head=n;
    }
    void deleteData(int reference){
        if(!isEmpty()){
            if(head->student.identifier==reference){
                head=head->next;
            }
            else{
                nodePointer aux=new Node;
                aux=head;
                while(aux->student.identifier!=reference){
                    aux=aux->next; 
                }
                 nodePointer newNext=new Node;
                newNext=aux->next->next;
                aux->next=newNext;
            }
        }
    }
    nodePointer search(int reference){
        if(!isEmpty()){
            nodePointer aux=new Node;
            aux=head; 
            bool found;
            while(aux!=NULL&&aux->student.identifier!=reference){
                found=(aux->student.identifier==reference);
                if(!found){
                    aux=aux->next;
                }
            }

            found =(aux->student.identifier==reference);
            if(found){
                return aux;
            }

        }
        return NULL;
    }

    void showAll(){
        nodePointer aux=new Node;
        aux=head;
        while(aux!=NULL){
            cout<<aux->student.name;
        }

    }
 
};



int main(){
    return 0;
};

