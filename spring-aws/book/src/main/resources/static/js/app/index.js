let main = {
    init : function () {
        let _this = this;
        $('#btn-save').on('click', function () {
           _this.save();
        });
        $('#btn-update').on('click', function () {
            _this.update();
        });
        $('#btn-delete').on('click', function () {
            _this.delete();
        });
    },
    save : function () {
        let data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        fetch('/api/v1/posts', {
            method: 'post',
            headers: {
                'Content-Type': 'application/json; charset=utf-8'
            },
            body: JSON.stringify(data)
        })
            .then(response => {
                if(!response.ok) {
                    throw new Error('에러 발생');
                }
                alert("글이 등록되었습니다.");
                window.location.href = '/';
            })
            .catch(error => {
                alert(JSON.stringify(error));
            })
    },
    update : function () {
        let data = {
            title: $('#title').val(),
            content: $('#content').val()
        };

        let id = $('#id').val();

        fetch('/api/v1/posts/'+id, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json; charset=utf-8'
            },
            body: JSON.stringify(data)
        })
            .then(response => {
                if(!response.ok) {
                    throw new Error('에러 발생');
                }
                alert('글이 수정되었습니다.');
                window.location.href = '/';
            })
            .catch(error => {
                alert(JSON.stringify(error));
            })
    },
    delete : function() {
        var id = $('#id').val();

        fetch('/api/v1/posts/'+id, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json; charset=utf-8'
            }
        })
            .then(response => {
                if(!response.ok) {
                    throw new Error('에러 발생');
                }
                alert('글이 삭제되었습니다.');
                window.location.href = '/';
            })
            .catch(error => {
                alert(JSON.stringify(error));
            })
    }
};

main.init();