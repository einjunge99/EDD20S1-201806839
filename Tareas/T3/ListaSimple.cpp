#include <iostream>
using namespace std;


class Student{
    public :
    int  identifier;
    string name;
    Student(){

    };
    Student(int _identifier,string _name){
    identifier=_identifier;
    name=_name;
    }
};




class SimpleList{
    public:
    typedef struct Node{
    Student student;
        Node* next;
    }* nodePointer;

    nodePointer head;
    

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
        n->next=head;

        head=n;

        
    }
    //it still has a bug while deleting, so I have to figure it out 
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
            cout<<aux->student.name<<"\n";
            aux=aux->next;
        }

    }
 

};



int main(){
    SimpleList list;
    list.add(201806839,"Isaac"); 
    list.add(201806840,"Gaby");   
    list.add(201806842,"Sam");   
    list.add(201806845,"Sofia");  

    cout<<"Initial data: \n";
     list.showAll(); 

    SimpleList::nodePointer aux=new SimpleList::Node;
    aux=list.search(201806845);
    cout<<"Search by code 201806839: \n";
    cout<<"Name: "<<aux->student.name<<"\n

