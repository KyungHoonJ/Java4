const commentListElem = document.getElementById("comment-list");
const commentForm = document.getElementById("board-comment");

const getList = async () => {
  const list = (
    await axios.get(`/comments?boardId=${commentListElem.dataset.boardId}`)
  ).data;
  console.log(list);
  setList(list, commentListElem);

  // list.forEach((item) => {
  //   const tempLiElem = document.createElement("li");
  //   tempLiElem.innerHTML = `${item.content} - ${item.userName} / ${new Date(
  //     item.createdAt
  //   )}`;
  //   const tempOlElem = document.createElement("ol");
  //   item.children.forEach((child) => {
  //     const tempLiElem2 = document.createElement("li");
  //     tempLiElem2.innerHTML = `${child.content} - ${
  //       child.userName
  //     } / ${new Date(item.createdAt)}`;
  //     tempOlElem.append(tempLiElem2);
  //   });
  //   tempLiElem.append(tempOlElem);

  //   commentListElem.append(tempLiElem);
  // });
};

function setList(list, parentElem) {
  list.forEach((item) => {
    const tempLiElem = document.createElement("li");
    tempLiElem.innerHTML = `${item.content} - ${item.userName} / ${new Date(
      item.createdAt
    )}`;
    
    if (commentForm) {
      const tempButtonOnElem = document.createElement("button");
      tempButtonOnElem.innerHTML = "댓글";
      tempLiElem.append(tempButtonOnElem);

      const tempFormElem = document.createElement("form");
      tempLiElem.append(tempFormElem);

      tempButtonOnElem.onclick = () => {
        tempFormElem.classList.toggle("on");
      };

      const tempContentElem = document.createElement("input");
      tempFormElem.append(tempContentElem);

      const tempButtonElem = document.createElement("button");
      tempButtonElem.innerHTML = "댓글 추가";
      tempFormElem.append(tempButtonElem);
    }

    const tempOlElem = document.createElement("ol");
    setList(item.children, tempOlElem);
    tempLiElem.append(tempOlElem);

    parentElem.append(tempLiElem);
  });
}

getList();
